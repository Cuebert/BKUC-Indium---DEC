.class Lf9/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf9/g;->s(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/content/Context;

.field final synthetic o:Lf9/g;


# direct methods
.method constructor <init>(Lf9/g;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lf9/g$b;->o:Lf9/g;

    iput-object p2, p0, Lf9/g$b;->n:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "rbx.xapkmanager"

    const-string v1, "unpackAssetsAsync: RUN ....."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lf9/g$b;->o:Lf9/g;

    iget-object v2, p0, Lf9/g$b;->n:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lf9/g;->r(Landroid/content/Context;)Ljava/lang/String;

    const-string v1, "unpackAssetsAsync: ...... DONE"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Lf9/g;->b(Ljava/lang/Thread;)Ljava/lang/Thread;

    return-void
.end method
