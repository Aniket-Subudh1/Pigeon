.class public final Lcom/example/chatmessenger/Utils;
.super Ljava/lang/Object;
.source "Utils.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
value = {
    Lcom/example/chatmessenger/Utils$Companion;
}
.end annotation

.annotation runtime Lkotlin/Metadata;
d1 = {
    "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"
}
d2 = {
    "Lcom/example/chatmessenger/Utils;",
    "",
    "()V",
    "Companion",
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


# static fields
.field public static final CHANNEL_ID:Ljava/lang/String; = "com.example.chatmessenger"

.field public static final Companion:Lcom/example/chatmessenger/Utils$Companion;

.field public static final MESSAGE_LEFT:I = 0x2

.field public static final MESSAGE_RIGHT:I = 0x1

.field public static final REQUEST_IMAGE_CAPTURE:I = 0x1

.field public static final REQUEST_IMAGE_PICK:I = 0x2

.field private static final auth:Lcom/google/firebase/auth/FirebaseAuth;

.field private static final context:Landroid/content/Context;

.field private static final firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

.field private static userid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
.registers 2

new-instance v0, Lcom/example/chatmessenger/Utils$Companion;

const/4 v1, 0x0

invoke-direct {v0, v1}, Lcom/example/chatmessenger/Utils$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

sput-object v0, Lcom/example/chatmessenger/Utils;->Companion:Lcom/example/chatmessenger/Utils$Companion;

.line 19
sget-object v0, Lcom/example/chatmessenger/MyApplication;->Companion:Lcom/example/chatmessenger/MyApplication$Companion;

invoke-virtual {v0}, Lcom/example/chatmessenger/MyApplication$Companion;->getInstance()Lcom/example/chatmessenger/MyApplication;

move-result-object v0

invoke-virtual {v0}, Lcom/example/chatmessenger/MyApplication;->getApplicationContext()Landroid/content/Context;

move-result-object v0

sput-object v0, Lcom/example/chatmessenger/Utils;->context:Landroid/content/Context;

.line 21
invoke-static {}, Lcom/google/firebase/firestore/FirebaseFirestore;->getInstance()Lcom/google/firebase/firestore/FirebaseFirestore;

move-result-object v0

const-string v1, "getInstance(...)"

invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

sput-object v0, Lcom/example/chatmessenger/Utils;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

.line 27
invoke-static {}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance()Lcom/google/firebase/auth/FirebaseAuth;

move-result-object v0

invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

sput-object v0, Lcom/example/chatmessenger/Utils;->auth:Lcom/google/firebase/auth/FirebaseAuth;

.line 28
const-string v0, ""

sput-object v0, Lcom/example/chatmessenger/Utils;->userid:Ljava/lang/String;

return-void
.end method

.method public constructor <init>()V
.registers 1

.line 14
invoke-direct {p0}, Ljava/lang/Object;-><init>()V

return-void
.end method

.method public static final synthetic access$getAuth$cp()Lcom/google/firebase/auth/FirebaseAuth;
.registers 1

.line 14
sget-object v0, Lcom/example/chatmessenger/Utils;->auth:Lcom/google/firebase/auth/FirebaseAuth;

return-object v0
.end method

.method public static final synthetic access$getContext$cp()Landroid/content/Context;
.registers 1

.line 14
sget-object v0, Lcom/example/chatmessenger/Utils;->context:Landroid/content/Context;

return-object v0
.end method

.method public static final synthetic access$getFirestore$cp()Lcom/google/firebase/firestore/FirebaseFirestore;
.registers 1

.line 14
sget-object v0, Lcom/example/chatmessenger/Utils;->firestore:Lcom/google/firebase/firestore/FirebaseFirestore;

return-object v0
.end method

.method public static final synthetic access$getUserid$cp()Ljava/lang/String;
.registers 1

.line 14
sget-object v0, Lcom/example/chatmessenger/Utils;->userid:Ljava/lang/String;

return-object v0
.end method

.method public static final synthetic access$setUserid$cp(Ljava/lang/String;)V
.registers 1
.param p0, "<set-?>"    # Ljava/lang/String;

.line 14
sput-object p0, Lcom/example/chatmessenger/Utils;->userid:Ljava/lang/String;

return-void
.end method
