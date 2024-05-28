.class Lw6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw6/b;


# direct methods
.method constructor <init>(Lw6/b;)V
    .locals 0

    iput-object p1, p0, Lw6/b$a;->a:Lw6/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw6/b$a;->a:Lw6/b;

    sget-object v1, Lw6/b$c;->n:Lw6/b$c;

    invoke-static {v0, v1}, Lw6/b;->a(Lw6/b;Lw6/b$c;)Lw6/b$c;

    .line 2
    iget-object v0, p0, Lw6/b$a;->a:Lw6/b;

    invoke-virtual {v0}, Lw6/b;->c()V

    return-void
.end method
