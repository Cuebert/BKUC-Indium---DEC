.class Lk8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk8/d;->a(Landroid/content/Context;Ll8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroidx/core/app/k$e;

.field final synthetic c:Ll8/c;

.field final synthetic d:Lw8/k;

.field final synthetic e:Lk8/d;


# direct methods
.method constructor <init>(Lk8/d;Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;Lw8/k;)V
    .locals 0

    iput-object p1, p0, Lk8/d$a;->e:Lk8/d;

    iput-object p2, p0, Lk8/d$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lk8/d$a;->b:Landroidx/core/app/k$e;

    iput-object p4, p0, Lk8/d$a;->c:Ll8/c;

    iput-object p5, p0, Lk8/d$a;->d:Lw8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk8/d$a;->e:Lk8/d;

    iget-object v1, p0, Lk8/d$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lk8/d$a;->b:Landroidx/core/app/k$e;

    iget-object v3, p0, Lk8/d$a;->c:Ll8/c;

    invoke-static {v0, v1, v2, v3}, Lk8/d;->b(Lk8/d;Landroid/content/Context;Landroidx/core/app/k$e;Ll8/c;)V

    .line 2
    iget-object v0, p0, Lk8/d$a;->d:Lw8/k;

    invoke-virtual {v0, p0}, Lw8/k;->T(Lw8/h;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lk8/d$a;->d:Lw8/k;

    invoke-virtual {v0, p0}, Lw8/k;->T(Lw8/h;)V

    return-void
.end method
