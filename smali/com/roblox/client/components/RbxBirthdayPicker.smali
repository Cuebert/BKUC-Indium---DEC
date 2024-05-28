.class public Lcom/roblox/client/components/RbxBirthdayPicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;,
        Lcom/roblox/client/components/RbxBirthdayPicker$e;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private H:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/lang/String;

.field private o:Landroid/widget/Spinner;

.field private p:Landroid/widget/Spinner;

.field private q:Landroid/widget/Spinner;

.field private r:Landroid/widget/LinearLayout;

.field private s:Lcom/roblox/client/components/RbxTextView;

.field private t:Lcom/roblox/client/components/RbxTextView;

.field private u:Lcom/roblox/client/components/f;

.field private v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string v0, "RbxBirthdayPicker"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->n:Ljava/lang/String;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    .line 4
    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    .line 5
    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/components/RbxBirthdayPicker;->j(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/components/RbxBirthdayPicker;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->m()Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/roblox/client/components/RbxBirthdayPicker;)Lcom/roblox/client/components/f;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->u:Lcom/roblox/client/components/f;

    return-object p0
.end method

.method static synthetic c(Lcom/roblox/client/components/RbxBirthdayPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    return p0
.end method

.method static synthetic d(Lcom/roblox/client/components/RbxBirthdayPicker;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->n()Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lcom/roblox/client/components/RbxBirthdayPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    return p0
.end method

.method static synthetic f(Lcom/roblox/client/components/RbxBirthdayPicker;)Z
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->o()Z

    move-result p0

    return p0
.end method

.method static synthetic g(Lcom/roblox/client/components/RbxBirthdayPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    return p0
.end method

.method private getDayList()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 2
    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->y:I

    iget v2, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->z:I

    if-ne v1, v0, :cond_0

    .line 3
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->A:I

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0, v0, v2}, Lcom/roblox/client/components/RbxBirthdayPicker;->l(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/16 v0, 0x1f

    .line 5
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->v:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method private getMonthList()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xb

    if-gt v1, v2, :cond_0

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getYearList()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roblox/client/z;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roblox/client/z;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    if-ltz v0, :cond_1

    if-gt v0, v1, :cond_1

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget v3, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->y:I

    sub-int/2addr v3, v0

    :goto_0
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->y:I

    sub-int/2addr v0, v1

    if-lt v3, v0, :cond_0

    .line 5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    return-object v2

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid birthday max/min age config!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic h(Lcom/roblox/client/components/RbxBirthdayPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->F:I

    return p0
.end method

.method static synthetic i(Lcom/roblox/client/components/RbxBirthdayPicker;)I
    .locals 0

    iget p0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->E:I

    return p0
.end method

.method private j(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->l0()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/roblox/client/a0;->F:I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getRootView()Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto :goto_0

    .line 3
    :cond_0
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/roblox/client/a0;->E:I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getRootView()Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 4
    :goto_0
    sget v2, Lcom/roblox/client/y;->K0:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    .line 5
    sget v2, Lcom/roblox/client/y;->L0:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    .line 6
    sget v2, Lcom/roblox/client/y;->N0:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    .line 7
    sget v2, Lcom/roblox/client/y;->J0:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->r:Landroid/widget/LinearLayout;

    .line 8
    sget v2, Lcom/roblox/client/y;->I0:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/roblox/client/components/RbxTextView;

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->s:Lcom/roblox/client/components/RbxTextView;

    .line 9
    sget v2, Lcom/roblox/client/y;->M0:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/roblox/client/components/RbxTextView;

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->t:Lcom/roblox/client/components/RbxTextView;

    .line 10
    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/v;->c:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->E:I

    .line 11
    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/v;->j:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->F:I

    .line 12
    iget-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    sget v3, Lcom/roblox/client/c0;->n0:I

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v3, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    sget v3, Lcom/roblox/client/c0;->o0:I

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v3, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    sget v3, Lcom/roblox/client/c0;->p0:I

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v3, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->t:Lcom/roblox/client/components/RbxTextView;

    sget v3, Lcom/roblox/client/c0;->B0:I

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v3, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->s:Lcom/roblox/client/components/RbxTextView;

    sget v3, Lcom/roblox/client/c0;->L1:I

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v3, v5}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->G:Ljava/util/HashMap;

    const/16 v2, 0xc

    new-array v3, v2, [Ljava/lang/String;

    .line 18
    sget v5, Lcom/roblox/client/c0;->w1:I

    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {v1, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    sget v5, Lcom/roblox/client/c0;->v1:I

    new-array v6, v4, [Ljava/lang/Object;

    .line 19
    invoke-static {v1, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v3, v6

    sget v5, Lcom/roblox/client/c0;->z1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 20
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x2

    aput-object v5, v3, v7

    sget v5, Lcom/roblox/client/c0;->s1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 21
    invoke-static {v1, v5, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x3

    aput-object v5, v3, v8

    sget v5, Lcom/roblox/client/c0;->A1:I

    new-array v9, v4, [Ljava/lang/Object;

    .line 22
    invoke-static {v1, v5, v9}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x4

    aput-object v5, v3, v9

    sget v5, Lcom/roblox/client/c0;->y1:I

    new-array v10, v4, [Ljava/lang/Object;

    .line 23
    invoke-static {v1, v5, v10}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x5

    aput-object v5, v3, v10

    sget v5, Lcom/roblox/client/c0;->x1:I

    new-array v11, v4, [Ljava/lang/Object;

    .line 24
    invoke-static {v1, v5, v11}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x6

    aput-object v5, v3, v11

    sget v5, Lcom/roblox/client/c0;->t1:I

    new-array v12, v4, [Ljava/lang/Object;

    .line 25
    invoke-static {v1, v5, v12}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v12, 0x7

    aput-object v5, v3, v12

    sget v5, Lcom/roblox/client/c0;->D1:I

    new-array v13, v4, [Ljava/lang/Object;

    .line 26
    invoke-static {v1, v5, v13}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v13, 0x8

    aput-object v5, v3, v13

    sget v5, Lcom/roblox/client/c0;->C1:I

    new-array v14, v4, [Ljava/lang/Object;

    .line 27
    invoke-static {v1, v5, v14}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v14, 0x9

    aput-object v5, v3, v14

    sget v5, Lcom/roblox/client/c0;->B1:I

    new-array v15, v4, [Ljava/lang/Object;

    .line 28
    invoke-static {v1, v5, v15}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v15, 0xa

    aput-object v5, v3, v15

    sget v5, Lcom/roblox/client/c0;->u1:I

    new-array v15, v4, [Ljava/lang/Object;

    .line 29
    invoke-static {v1, v5, v15}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v15, 0xb

    aput-object v5, v3, v15

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_1

    .line 30
    iget-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->G:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aget-object v14, v3, v5

    invoke-virtual {v2, v15, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    const/16 v2, 0xc

    const/16 v14, 0x9

    const/16 v15, 0xb

    goto :goto_1

    .line 31
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 32
    invoke-virtual {v2, v6}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iput v3, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->y:I

    .line 33
    invoke-virtual {v2, v7}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iput v3, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->z:I

    .line 34
    invoke-virtual {v2, v10}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->A:I

    .line 35
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->H:Ljava/util/HashMap;

    const/16 v2, 0x1f

    new-array v3, v2, [Ljava/lang/String;

    .line 36
    sget v5, Lcom/roblox/client/c0;->I0:I

    new-array v14, v4, [Ljava/lang/Object;

    invoke-static {v1, v5, v14}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    sget v5, Lcom/roblox/client/c0;->T0:I

    new-array v14, v4, [Ljava/lang/Object;

    .line 37
    invoke-static {v1, v5, v14}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v6

    sget v5, Lcom/roblox/client/c0;->e1:I

    new-array v14, v4, [Ljava/lang/Object;

    .line 38
    invoke-static {v1, v5, v14}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v7

    sget v5, Lcom/roblox/client/c0;->h1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 39
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v8

    sget v5, Lcom/roblox/client/c0;->i1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 40
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v9

    sget v5, Lcom/roblox/client/c0;->j1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 41
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v10

    sget v5, Lcom/roblox/client/c0;->k1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 42
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v11

    sget v5, Lcom/roblox/client/c0;->l1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 43
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v12

    sget v5, Lcom/roblox/client/c0;->m1:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 44
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v13

    sget v5, Lcom/roblox/client/c0;->J0:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 45
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x9

    aput-object v5, v3, v7

    sget v5, Lcom/roblox/client/c0;->K0:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 46
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0xa

    aput-object v5, v3, v7

    sget v5, Lcom/roblox/client/c0;->L0:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 47
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0xb

    aput-object v5, v3, v7

    sget v5, Lcom/roblox/client/c0;->M0:I

    new-array v7, v4, [Ljava/lang/Object;

    .line 48
    invoke-static {v1, v5, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0xc

    aput-object v5, v3, v7

    const/16 v5, 0xd

    sget v7, Lcom/roblox/client/c0;->N0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 49
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0xe

    sget v7, Lcom/roblox/client/c0;->O0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 50
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0xf

    sget v7, Lcom/roblox/client/c0;->P0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 51
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x10

    sget v7, Lcom/roblox/client/c0;->Q0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 52
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x11

    sget v7, Lcom/roblox/client/c0;->R0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 53
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x12

    sget v7, Lcom/roblox/client/c0;->S0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 54
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x13

    sget v7, Lcom/roblox/client/c0;->U0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 55
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x14

    sget v7, Lcom/roblox/client/c0;->V0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 56
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x15

    sget v7, Lcom/roblox/client/c0;->W0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 57
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x16

    sget v7, Lcom/roblox/client/c0;->X0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 58
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x17

    sget v7, Lcom/roblox/client/c0;->Y0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 59
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x18

    sget v7, Lcom/roblox/client/c0;->Z0:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 60
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x19

    sget v7, Lcom/roblox/client/c0;->a1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 61
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x1a

    sget v7, Lcom/roblox/client/c0;->b1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 62
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x1b

    sget v7, Lcom/roblox/client/c0;->c1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 63
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x1c

    sget v7, Lcom/roblox/client/c0;->d1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 64
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x1d

    sget v7, Lcom/roblox/client/c0;->f1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 65
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v5

    const/16 v5, 0x1e

    sget v7, Lcom/roblox/client/c0;->g1:I

    new-array v8, v4, [Ljava/lang/Object;

    .line 66
    invoke-static {v1, v7, v8}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v5

    .line 67
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->v:Ljava/util/ArrayList;

    const/4 v1, 0x1

    :goto_2
    if-gt v1, v2, :cond_2

    .line 68
    iget-object v5, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->v:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    if-gt v6, v2, :cond_3

    .line 69
    iget-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->H:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v7, v6, -0x1

    aget-object v7, v3, v7

    invoke-virtual {v1, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 70
    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getYearList()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->w:Ljava/util/ArrayList;

    .line 71
    invoke-direct/range {p0 .. p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getMonthList()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->x:Ljava/util/ArrayList;

    .line 72
    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_4

    .line 73
    invoke-direct/range {p0 .. p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getDayList()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, -0x1

    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 75
    invoke-direct/range {p0 .. p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getYearList()Ljava/util/ArrayList;

    move-result-object v3

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 77
    invoke-direct/range {p0 .. p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getMonthList()Ljava/util/ArrayList;

    move-result-object v5

    .line 78
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 79
    invoke-direct {v0, v1}, Lcom/roblox/client/components/RbxBirthdayPicker;->setDaySpinner(Ljava/util/List;)V

    .line 80
    invoke-direct {v0, v3}, Lcom/roblox/client/components/RbxBirthdayPicker;->setYearSpinner(Ljava/util/List;)V

    .line 81
    invoke-direct {v0, v5}, Lcom/roblox/client/components/RbxBirthdayPicker;->setMonthSpinner(Ljava/util/List;)V

    .line 82
    iget-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    new-instance v2, Lcom/roblox/client/components/RbxBirthdayPicker$a;

    invoke-direct {v2, v0}, Lcom/roblox/client/components/RbxBirthdayPicker$a;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 83
    iget-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    new-instance v2, Lcom/roblox/client/components/RbxBirthdayPicker$b;

    invoke-direct {v2, v0}, Lcom/roblox/client/components/RbxBirthdayPicker$b;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 84
    iget-object v1, v0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    new-instance v2, Lcom/roblox/client/components/RbxBirthdayPicker$c;

    invoke-direct {v2, v0}, Lcom/roblox/client/components/RbxBirthdayPicker$c;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    :cond_4
    return-void
.end method

.method private l(II)I
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    const/16 v0, 0x1c

    if-ne p2, p1, :cond_0

    return v0

    :cond_0
    new-instance p1, Ljava/util/GregorianCalendar;

    invoke-direct {p1}, Ljava/util/GregorianCalendar;-><init>()V

    invoke-virtual {p1, p2}, Ljava/util/GregorianCalendar;->isLeapYear(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v0, 0x1d

    :cond_1
    return v0

    :cond_2
    const/4 p2, 0x3

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_4

    const/16 p2, 0x8

    if-eq p1, p2, :cond_4

    const/16 p2, 0xa

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    const/16 p1, 0x1f

    return p1

    :cond_4
    :goto_0
    const/16 p1, 0x1e

    return p1
.end method

.method private m()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    .line 2
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    .line 3
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    if-eq v1, v3, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->t()V

    .line 5
    :cond_0
    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    if-eq v0, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private n()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    .line 2
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->t()V

    .line 4
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    if-eq v1, v3, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->u()V

    .line 6
    :cond_0
    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    if-eq v0, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private o()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    .line 2
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->u()V

    .line 4
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    if-eq v1, v3, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->v()V

    .line 6
    :cond_0
    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    if-eq v0, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private setDaySpinner(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/roblox/client/components/RbxBirthdayPicker$e;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roblox/client/a0;->J:I

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;Landroid/content/Context;ILjava/util/List;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->I:I

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->setDropDownViewResource(I)V

    const-string p1, "--"

    .line 3
    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->e(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->H:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->d(Ljava/util/HashMap;)V

    .line 5
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method private setMonthSpinner(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/roblox/client/components/RbxBirthdayPicker$e;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roblox/client/a0;->J:I

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;Landroid/content/Context;ILjava/util/List;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->I:I

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->setDropDownViewResource(I)V

    const-string p1, "--"

    .line 3
    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->e(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->G:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->d(Ljava/util/HashMap;)V

    .line 5
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method private setYearSpinner(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/roblox/client/components/RbxBirthdayPicker$e;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roblox/client/a0;->J:I

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;Landroid/content/Context;ILjava/util/List;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->I:I

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->setDropDownViewResource(I)V

    const-string p1, "----"

    .line 3
    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$e;->e(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method private t()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getDayList()Ljava/util/ArrayList;

    move-result-object v0

    .line 2
    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    .line 3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 6
    iget v5, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    .line 7
    invoke-direct {p0, v0}, Lcom/roblox/client/components/RbxBirthdayPicker;->setDaySpinner(Ljava/util/List;)V

    .line 8
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    if-le v0, v4, :cond_1

    .line 9
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_0

    :cond_1
    if-ne v5, v3, :cond_2

    .line 10
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_0

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setSelection(I)V

    :goto_0
    return-void
.end method

.method private u()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 2
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    iget v3, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->y:I

    if-ne v0, v3, :cond_0

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->x:Ljava/util/ArrayList;

    iget v4, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->z:I

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v2, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->getMonthList()Ljava/util/ArrayList;

    move-result-object v0

    .line 5
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 6
    :cond_1
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    iget v3, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->y:I

    if-ne v0, v3, :cond_2

    .line 7
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->x:Ljava/util/ArrayList;

    iget v3, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->z:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->x:Ljava/util/ArrayList;

    .line 9
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 10
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 11
    iget v5, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    .line 12
    invoke-direct {p0, v0}, Lcom/roblox/client/components/RbxBirthdayPicker;->setMonthSpinner(Ljava/util/List;)V

    .line 13
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    if-le v0, v4, :cond_3

    .line 14
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_2

    :cond_3
    if-ne v5, v1, :cond_4

    .line 15
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_2

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setSelection(I)V

    :goto_2
    return-void
.end method

.method private v()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->w:Ljava/util/ArrayList;

    iget v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->w:Ljava/util/ArrayList;

    invoke-direct {p0, v1}, Lcom/roblox/client/components/RbxBirthdayPicker;->setYearSpinner(Ljava/util/List;)V

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getDay()I
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMonth()I
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRbxDateChangedListener()Lcom/roblox/client/components/f;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->u:Lcom/roblox/client/components/f;

    return-object v0
.end method

.method public getYear()I
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public k()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/components/h;->b(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    new-instance v0, Lcom/roblox/client/components/RbxBirthdayPicker$d;

    invoke-direct {v0, p0}, Lcom/roblox/client/components/RbxBirthdayPicker$d;-><init>(Lcom/roblox/client/components/RbxBirthdayPicker;)V

    .line 4
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 5
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 6
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3
    :cond_0
    check-cast p1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;

    .line 4
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 5
    iget v0, p1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->o:I

    iget v1, p1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->n:I

    iget p1, p1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->p:I

    invoke-virtual {p0, v0, v1, p1}, Lcom/roblox/client/components/RbxBirthdayPicker;->p(III)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;

    invoke-direct {v1, v0}, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    iput v0, v1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->o:I

    .line 4
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    iput v0, v1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->n:I

    .line 5
    iget v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    iput v0, v1, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->p:I

    return-object v1
.end method

.method public p(III)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->D:I

    .line 2
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->v()V

    .line 3
    iput p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->C:I

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->u()V

    .line 5
    iput p2, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->B:I

    .line 6
    invoke-direct {p0}, Lcom/roblox/client/components/RbxBirthdayPicker;->t()V

    return-void
.end method

.method public q()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->r:Landroid/widget/LinearLayout;

    sget v1, Lcom/roblox/client/x;->A:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->s:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->s:Lcom/roblox/client/components/RbxTextView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const-wide/16 v5, 0xc8

    invoke-static/range {v1 .. v6}, Lcom/roblox/client/components/h;->a(Landroid/view/View;IFFJ)V

    :cond_0
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->r:Landroid/widget/LinearLayout;

    sget v1, Lcom/roblox/client/x;->B:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->s:Lcom/roblox/client/components/RbxTextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/roblox/client/components/h;->d(Landroid/view/View;)Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->o:Landroid/widget/Spinner;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->p:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->q:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public setRbxDateChangedListener(Lcom/roblox/client/components/f;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->u:Lcom/roblox/client/components/f;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->t:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->t:Lcom/roblox/client/components/RbxTextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->t:Lcom/roblox/client/components/RbxTextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public setTitleColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker;->t:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
