.class Lb9/a$a;
.super Lh7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb9/a;


# direct methods
.method constructor <init>(Lb9/a;)V
    .locals 0

    iput-object p1, p0, Lb9/a$a;->a:Lb9/a;

    invoke-direct {p0}, Lh7/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lh7/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb9/a$a;->a:Lb9/a;

    invoke-static {v0}, Lb9/a;->a(Lb9/a;)Lh7/m;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lb9/a$a;->a:Lb9/a;

    invoke-static {v0}, Lb9/a;->a(Lb9/a;)Lh7/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lh7/m;->a(Lh7/j;)V

    :cond_0
    return-void
.end method
