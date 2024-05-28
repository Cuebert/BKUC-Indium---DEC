.class public Lcom/roblox/client/landing/AboutActivity;
.super Lcom/roblox/client/i0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    return-void
.end method

.method public static synthetic A1(Lcom/roblox/client/landing/AboutActivity;Landroid/view/View;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/landing/AboutActivity;->B1(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private synthetic B1(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/client/l;->g()Lcom/roblox/client/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/l;->i()Lcom/roblox/client/l$b;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/roblox/client/landing/AboutActivity$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "64-bit"

    goto :goto_0

    :cond_1
    const-string v0, "32-bit"

    .line 4
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -- Ver:1600"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "FragmentAbout"

    const-string v0, "onCreate()"

    .line 2
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    sget p1, Lcom/roblox/client/a0;->m:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 4
    sget p1, Lcom/roblox/client/y;->z:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 5
    sget v0, Lcom/roblox/client/y;->B:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 6
    sget v1, Lcom/roblox/client/y;->C:I

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 7
    sget v2, Lcom/roblox/client/y;->A:I

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 8
    new-instance v3, Lcom/roblox/client/landing/AboutActivity$a;

    invoke-direct {v3, p0}, Lcom/roblox/client/landing/AboutActivity$a;-><init>(Lcom/roblox/client/landing/AboutActivity;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-static {p0, v0}, Ld9/b;->b(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 10
    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    new-instance p1, Lr7/a;

    invoke-direct {p1, p0}, Lr7/a;-><init>(Lcom/roblox/client/landing/AboutActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onStart()V

    const-string v0, "about"

    .line 2
    invoke-static {v0}, Lcom/roblox/client/f0;->t(Ljava/lang/String;)V

    return-void
.end method
