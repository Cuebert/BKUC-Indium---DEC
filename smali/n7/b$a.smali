.class Ln7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln7/b;->g()Ln7/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ln7/b;


# direct methods
.method constructor <init>(Ln7/b;)V
    .locals 0

    iput-object p1, p0, Ln7/b$a;->n:Ln7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Ln7/b;->d()Ln7/b;

    move-result-object v0

    new-instance v1, Ln7/b$b;

    iget-object v2, p0, Ln7/b$a;->n:Ln7/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ln7/b$b;-><init>(Ln7/b;Ln7/b$a;)V

    invoke-virtual {v0, v1}, Lw6/b;->b(Lw6/c;)V

    return-void
.end method
