.class Lcom/roblox/client/signup/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lh7/f;


# direct methods
.method constructor <init>(Lh7/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.signup"

    const-string v1, "[SignUpHelper] Constructor called."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iput-object p1, p0, Lcom/roblox/client/signup/e;->a:Lh7/f;

    return-void
.end method
