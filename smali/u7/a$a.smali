.class Lu7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu7/a;->d(Ljava/util/Locale;Ls7/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/d<",
        "Lob/j0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ls7/g;

.field final synthetic b:Lu7/a;


# direct methods
.method constructor <init>(Lu7/a;Ls7/g;)V
    .locals 0

    iput-object p1, p0, Lu7/a$a;->b:Lu7/a;

    iput-object p2, p0, Lu7/a$a;->a:Ls7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgc/b;Lgc/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Lob/j0;",
            ">;",
            "Lgc/t<",
            "Lob/j0;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lu7/a$a;->b:Lu7/a;

    invoke-static {p2}, Lc9/o;->a(Lgc/t;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lgc/t;->b()I

    move-result p2

    iget-object v1, p0, Lu7/a$a;->a:Ls7/g;

    invoke-virtual {p1, v0, p2, v1}, Lu7/a;->c(Ljava/lang/String;ILs7/g;)V

    return-void
.end method

.method public b(Lgc/b;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/b<",
            "Lob/j0;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lu7/a$a;->b:Lu7/a;

    iget-object p2, p0, Lu7/a$a;->a:Ls7/g;

    invoke-virtual {p1, p2}, Lu7/a;->b(Ls7/g;)V

    return-void
.end method
