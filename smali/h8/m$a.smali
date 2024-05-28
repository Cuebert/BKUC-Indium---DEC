.class Lh8/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh8/m;


# direct methods
.method constructor <init>(Lh8/m;)V
    .locals 0

    iput-object p1, p0, Lh8/m$a;->a:Lh8/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj8/n;Landroid/content/Context;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p1}, Lj8/n;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh8/m$a;->a:Lh8/m;

    invoke-static {v0, p2}, Lh8/m;->a(Lh8/m;Landroid/content/Context;)Lh8/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lh8/m$a;->a:Lh8/m;

    invoke-virtual {p1}, Lj8/n;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lh8/r;

    invoke-direct {v1}, Lh8/r;-><init>()V

    iget-object v2, p0, Lh8/m$a;->a:Lh8/m;

    .line 3
    invoke-static {v2, p2}, Lh8/m;->a(Lh8/m;Landroid/content/Context;)Lh8/n;

    move-result-object v2

    invoke-interface {v2}, Lh8/n;->b()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v0, p2, p1, v1, v2}, Lh8/m;->s(Landroid/content/Context;Ljava/lang/String;Lh8/r;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
