.class public final Lcom/example/chatmessenger/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
d1 = {
    "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0008\u0010\u0019\u001a\u00020\u0018H\u0017J\u0012\u0010\u001a\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0008\u0010\u001d\u001a\u00020\u0018H\u0014J\u0008\u0010\u001e\u001a\u00020\u0018H\u0014J\u0008\u0010\u001f\u001a\u00020\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006 "
}
d2 = {
    "Lcom/example/chatmessenger/MainActivity;",
    "Landroidx/appcompat/app/AppCompatActivity;",
    "()V",
    "auth",
    "Lcom/google/firebase/auth/FirebaseAuth;",
    "getAuth",
    "()Lcom/google/firebase/auth/FirebaseAuth;",
    "setAuth",
    "(Lcom/google/firebase/auth/FirebaseAuth;)V",
    "firestore",
    "Lcom/google/firebase/firestore/FirebaseFirestore;",
    "getFirestore",
    "()Lcom/google/firebase/firestore/FirebaseFirestore;",
    "setFirestore",
    "(Lcom/google/firebase/firestore/FirebaseFirestore;)V",
    "navController",
    "Landroidx/navigation/NavController;",
    "token",
    "",
    "getToken",
    "()Ljava/lang/String;",
    "setToken",
    "(Ljava/lang/String;)V",
    "generateToken",
    "",
    "onBackPressed",
    "onCreate",
    "savedInstanceState",
    "Landroid/os/Bundle;",
    "onPause",
    "onResume",
    "onStart",
    "app_debug"
}
k = 0x1
mv = {
    0x1,
    0x9,
    0x0
}
xi = 0x30
.end annotation


# instance fields
.field public auth:Lcom/google/firebase/auth/FirebaseAuth;

.field public firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

.field private navController:Landroidx/navigation/NavController;

.field private token:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$2IIkEaHbEEPaDaq1jG9t6yToZIQ(Ljava/lang/Exception;)V
.registers 1

invoke-static {p0}, Lcom/example/chatmessenger/MainActivity;->generateToken$lambda$1(Ljava/lang/Exception;)V

return-void
.end method

.method public static synthetic $r8$lambda$Nai4QW7Zmnhb3TI1_CTl4v2SD0c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
.registers 2

invoke-static {p0, p1}, Lcom/example/chatmessenger/MainActivity;->generateToken$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

return-void
.end method

.method public constructor <init>()V
.registers 2

.line 20
invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

.line 27
const-string v0, ""

iput-object v0, p0, Lcom/example/chatmessenger/MainActivity;->token:Ljava/lang/String;

.line 20
return-void
.end method

.method private static final generateToken$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
.registers 3
.param p0, "$tmp0"    # Lkotlin/jvm/functions/Function1;
.param p1, "p0"    # Ljava/lang/Object;

const-string v0, "$tmp0"

invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

.line 54
invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

return-void
.end method

.method private static final generateToken$lambda$1(Ljava/lang/Exception;)V
.registers 2
.param p0, "it"    # Ljava/lang/Exception;

const-string v0, "it"

invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

.line 82
return-void
.end method


# virtual methods
.method public final generateToken()V
.registers 5

.line 52
invoke-static {}, Lcom/google/firebase/installations/FirebaseInstallations;->getInstance()Lcom/google/firebase/installations/FirebaseInstallations;

move-result-object v0

const-string v1, "getInstance(...)"

invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

.line 54
.local v0, "firebaseInstance":Lcom/google/firebase/installations/FirebaseInstallations;
invoke-virtual {v0}, Lcom/google/firebase/installations/FirebaseInstallations;->getId()Lcom/google/android/gms/tasks/Task;

move-result-object v1

new-instance v2, Lcom/example/chatmessenger/MainActivity$generateToken$1;

invoke-direct {v2, p0}, Lcom/example/chatmessenger/MainActivity$generateToken$1;-><init>(Lcom/example/chatmessenger/MainActivity;)V

check-cast v2, Lkotlin/jvm/functions/Function1;

new-instance v3, Lcom/example/chatmessenger/MainActivity$$ExternalSyntheticLambda0;

invoke-direct {v3, v2}, Lcom/example/chatmessenger/MainActivity$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

move-result-object v1

new-instance v2, Lcom/example/chatmessenger/MainActivity$$ExternalSyntheticLambda1;

invoke-direct {v2}, Lcom/example/chatmessenger/MainActivity$$ExternalSyntheticLambda1;-><init>()V

.line 78
invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

.line 86
return-void
.end method

.method public final getAuth()Lcom/google/firebase/auth/FirebaseAuth;
.registers 2

.line 25
iget-object v0, p0, Lcom/example/chatmessenger/MainActivity;->auth:Lcom/google/firebase/auth/FirebaseAuth;

if-eqz v0, :cond_5

return-object v0

    :cond_5
const-string v0, "auth"

invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

const/4 v0, 0x0

return-object v0
.end method

.method public final getFirestore()Lcom/google/firebase/firestore/FirebaseFirestore;
.registers 2

.line 26
iget-object v0, p0, Lcom/example/chatmessenger/MainActivity;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

if-eqz v0, :cond_5

return-object v0

    :cond_5
const-string v0, "firestore"

invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

const/4 v0, 0x0

return-object v0
.end method

.method public final getToken()Ljava/lang/String;
.registers 2

.line 27
iget-object v0, p0, Lcom/example/chatmessenger/MainActivity;->token:Ljava/lang/String;

return-object v0
.end method

.method public onBackPressed()V
.registers 5
.annotation runtime Lkotlin/Deprecated;
message = "Deprecated in Java"
.end annotation

.line 130
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

move-result-object v0

invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

move-result v0

if-lez v0, :cond_e

.line 131
invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onBackPressed()V

goto :goto_32

.line 134
:cond_e
iget-object v0, p0, Lcom/example/chatmessenger/MainActivity;->navController:Landroidx/navigation/NavController;

if-nez v0, :cond_18

const-string v0, "navController"

invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

const/4 v0, 0x0

:cond_18
invoke-virtual {v0}, Landroidx/navigation/NavController;->getCurrentDestination()Landroidx/navigation/NavDestination;

move-result-object v0

const/4 v1, 0x1

const/4 v2, 0x0

if-eqz v0, :cond_29

invoke-virtual {v0}, Landroidx/navigation/NavDestination;->getId()I

move-result v0

sget v3, Lcom/example/chatmessenger/R$id;->homeFragment:I

if-ne v0, v3, :cond_29

move v2, v1

:cond_29
if-eqz v2, :cond_2f

.line 135
invoke-virtual {p0, v1}, Lcom/example/chatmessenger/MainActivity;->moveTaskToBack(Z)Z

goto :goto_32

.line 137
:cond_2f
invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onBackPressed()V

.line 140
:goto_32
return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
.registers 4
.param p1, "savedInstanceState"    # Landroid/os/Bundle;

.line 32
invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

.line 33
sget v0, Lcom/example/chatmessenger/R$layout;->activity_main:I

invoke-virtual {p0, v0}, Lcom/example/chatmessenger/MainActivity;->setContentView(I)V

.line 36
invoke-static {}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance()Lcom/google/firebase/auth/FirebaseAuth;

move-result-object v0

const-string v1, "getInstance(...)"

invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

invoke-virtual {p0, v0}, Lcom/example/chatmessenger/MainActivity;->setAuth(Lcom/google/firebase/auth/FirebaseAuth;)V

.line 37
invoke-static {}, Lcom/google/firebase/firestore/FirebaseFirestore;->getInstance()Lcom/google/firebase/firestore/FirebaseFirestore;

move-result-object v0

invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

invoke-virtual {p0, v0}, Lcom/example/chatmessenger/MainActivity;->setFirestore(Lcom/google/firebase/firestore/FirebaseFirestore;)V

.line 40
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

move-result-object v0

sget v1, Lcom/example/chatmessenger/R$id;->nav_host_fragment:I

invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

move-result-object v0

const-string v1, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"

invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

check-cast v0, Landroidx/navigation/fragment/NavHostFragment;

.line 41
.local v0, "navHostFragment":Landroidx/navigation/fragment/NavHostFragment;
invoke-virtual {v0}, Landroidx/navigation/fragment/NavHostFragment;->getNavController()Landroidx/navigation/NavController;

move-result-object v1

iput-object v1, p0, Lcom/example/chatmessenger/MainActivity;->navController:Landroidx/navigation/NavController;

.line 43
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->generateToken()V

.line 45
return-void
.end method

.method protected onPause()V
.registers 5

.line 103
invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onPause()V

.line 106
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getAuth()Lcom/google/firebase/auth/FirebaseAuth;

move-result-object v0

invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getCurrentUser()Lcom/google/firebase/auth/FirebaseUser;

move-result-object v0

if-eqz v0, :cond_2b

.line 109
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getFirestore()Lcom/google/firebase/firestore/FirebaseFirestore;

move-result-object v0

const-string v1, "Users"

invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

move-result-object v0

sget-object v1, Lcom/example/chatmessenger/Utils;->Companion:Lcom/example/chatmessenger/Utils$Companion;

invoke-virtual {v1}, Lcom/example/chatmessenger/Utils$Companion;->getUidLoggedIn()Ljava/lang/String;

move-result-object v1

invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/CollectionReference;->document(Ljava/lang/String;)Lcom/google/firebase/firestore/DocumentReference;

move-result-object v0

const/4 v1, 0x0

new-array v1, v1, [Ljava/lang/Object;

const-string v2, "status"

const-string v3, "Offline"

invoke-virtual {v0, v2, v3, v1}, Lcom/google/firebase/firestore/DocumentReference;->update(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

.line 113
:cond_2b
return-void
.end method

.method protected onResume()V
.registers 5

.line 91
invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

.line 93
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getAuth()Lcom/google/firebase/auth/FirebaseAuth;

move-result-object v0

invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getCurrentUser()Lcom/google/firebase/auth/FirebaseUser;

move-result-object v0

if-eqz v0, :cond_2b

.line 96
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getFirestore()Lcom/google/firebase/firestore/FirebaseFirestore;

move-result-object v0

const-string v1, "Users"

invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

move-result-object v0

sget-object v1, Lcom/example/chatmessenger/Utils;->Companion:Lcom/example/chatmessenger/Utils$Companion;

invoke-virtual {v1}, Lcom/example/chatmessenger/Utils$Companion;->getUidLoggedIn()Ljava/lang/String;

move-result-object v1

invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/CollectionReference;->document(Ljava/lang/String;)Lcom/google/firebase/firestore/DocumentReference;

move-result-object v0

const/4 v1, 0x0

new-array v1, v1, [Ljava/lang/Object;

const-string v2, "status"

const-string v3, "Online"

invoke-virtual {v0, v2, v3, v1}, Lcom/google/firebase/firestore/DocumentReference;->update(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

.line 100
:cond_2b
return-void
.end method

.method protected onStart()V
.registers 5

.line 116
invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

.line 118
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getAuth()Lcom/google/firebase/auth/FirebaseAuth;

move-result-object v0

invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getCurrentUser()Lcom/google/firebase/auth/FirebaseUser;

move-result-object v0

if-eqz v0, :cond_2b

.line 121
invoke-virtual {p0}, Lcom/example/chatmessenger/MainActivity;->getFirestore()Lcom/google/firebase/firestore/FirebaseFirestore;

move-result-object v0

const-string v1, "Users"

invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

move-result-object v0

sget-object v1, Lcom/example/chatmessenger/Utils;->Companion:Lcom/example/chatmessenger/Utils$Companion;

invoke-virtual {v1}, Lcom/example/chatmessenger/Utils$Companion;->getUidLoggedIn()Ljava/lang/String;

move-result-object v1

invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/CollectionReference;->document(Ljava/lang/String;)Lcom/google/firebase/firestore/DocumentReference;

move-result-object v0

const/4 v1, 0x0

new-array v1, v1, [Ljava/lang/Object;

const-string v2, "status"

const-string v3, "Online"

invoke-virtual {v0, v2, v3, v1}, Lcom/google/firebase/firestore/DocumentReference;->update(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

.line 125
:cond_2b
return-void
.end method

.method public final setAuth(Lcom/google/firebase/auth/FirebaseAuth;)V
.registers 3
.param p1, "<set-?>"    # Lcom/google/firebase/auth/FirebaseAuth;

const-string v0, "<set-?>"

invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

.line 25
iput-object p1, p0, Lcom/example/chatmessenger/MainActivity;->auth:Lcom/google/firebase/auth/FirebaseAuth;

return-void
.end method

.method public final setFirestore(Lcom/google/firebase/firestore/FirebaseFirestore;)V
.registers 3
.param p1, "<set-?>"    # Lcom/google/firebase/firestore/FirebaseFirestore;

const-string v0, "<set-?>"

invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

.line 26
iput-object p1, p0, Lcom/example/chatmessenger/MainActivity;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

return-void
.end method

.method public final setToken(Ljava/lang/String;)V
.registers 3
.param p1, "<set-?>"    # Ljava/lang/String;

const-string v0, "<set-?>"

invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

.line 27
iput-object p1, p0, Lcom/example/chatmessenger/MainActivity;->token:Ljava/lang/String;

return-void
.end method
