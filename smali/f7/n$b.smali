.class Lf7/n$b;
.super Lcom/roblox/engine/jni/EngineExitJavaCallback2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/n;->f0(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf7/n;


# direct methods
.method constructor <init>(Lf7/n;)V
    .locals 0

    iput-object p1, p0, Lf7/n$b;->a:Lf7/n;

    invoke-direct {p0}, Lcom/roblox/engine/jni/EngineExitJavaCallback2;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "... (onCreate) gameDidLeave callback invoked."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/n$b;->a:Lf7/n;

    invoke-static {v0}, Lf7/n;->u(Lf7/n;)V

    .line 3
    iget-object v0, p0, Lf7/n$b;->a:Lf7/n;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf7/n;->Q(Z)V

    return-void
.end method
