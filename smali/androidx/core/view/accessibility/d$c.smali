.class Landroidx/core/view/accessibility/d$c;
.super Landroidx/core/view/accessibility/d$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/accessibility/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>(Landroidx/core/view/accessibility/d;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/view/accessibility/d$b;-><init>(Landroidx/core/view/accessibility/d;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/accessibility/d$a;->a:Landroidx/core/view/accessibility/d;

    .line 2
    invoke-static {p2}, Landroidx/core/view/accessibility/c;->z0(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroidx/core/view/accessibility/c;

    move-result-object p2

    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/accessibility/d;->a(ILandroidx/core/view/accessibility/c;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
