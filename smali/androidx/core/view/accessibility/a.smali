.class public final Landroidx/core/view/accessibility/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field private final n:I

.field private final o:Landroidx/core/view/accessibility/c;

.field private final p:I


# direct methods
.method public constructor <init>(ILandroidx/core/view/accessibility/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    iput p1, p0, Landroidx/core/view/accessibility/a;->n:I

    .line 3
    iput-object p2, p0, Landroidx/core/view/accessibility/a;->o:Landroidx/core/view/accessibility/c;

    .line 4
    iput p3, p0, Landroidx/core/view/accessibility/a;->p:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget v0, p0, Landroidx/core/view/accessibility/a;->n:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 3
    iget-object v0, p0, Landroidx/core/view/accessibility/a;->o:Landroidx/core/view/accessibility/c;

    iget v1, p0, Landroidx/core/view/accessibility/a;->p:I

    invoke-virtual {v0, v1, p1}, Landroidx/core/view/accessibility/c;->O(ILandroid/os/Bundle;)Z

    return-void
.end method
