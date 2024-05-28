.class final Ly0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/b$b<",
        "Lh0/h<",
        "Landroidx/core/view/accessibility/c;",
        ">;",
        "Landroidx/core/view/accessibility/c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/h;

    invoke-virtual {p0, p1, p2}, Ly0/a$b;->c(Lh0/h;I)Landroidx/core/view/accessibility/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh0/h;

    invoke-virtual {p0, p1}, Ly0/a$b;->d(Lh0/h;)I

    move-result p1

    return p1
.end method

.method public c(Lh0/h;I)Landroidx/core/view/accessibility/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/h<",
            "Landroidx/core/view/accessibility/c;",
            ">;I)",
            "Landroidx/core/view/accessibility/c;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lh0/h;->p(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/view/accessibility/c;

    return-object p1
.end method

.method public d(Lh0/h;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/h<",
            "Landroidx/core/view/accessibility/c;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lh0/h;->o()I

    move-result p1

    return p1
.end method
