.class Ln7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln7/a;->b(Lw6/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw6/a;

.field final synthetic b:Ln7/a;


# direct methods
.method constructor <init>(Ln7/a;Lw6/a;)V
    .locals 0

    iput-object p1, p0, Ln7/a$a;->b:Ln7/a;

    iput-object p2, p0, Ln7/a$a;->a:Lw6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx8/d;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ln7/a$a;->a:Lw6/a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lw6/a;->a()V

    :cond_0
    return-void
.end method
