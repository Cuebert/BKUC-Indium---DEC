.class public Lcom/roblox/client/signup/UsernameSignUpEditText;
.super Lcom/roblox/client/components/RbxLoadingEditText;
.source "SourceFile"


# instance fields
.field private H:Lcom/roblox/client/signup/b;

.field private final I:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/components/RbxLoadingEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Lcom/roblox/client/signup/UsernameSignUpEditText$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/signup/UsernameSignUpEditText$a;-><init>(Lcom/roblox/client/signup/UsernameSignUpEditText;)V

    iput-object p1, p0, Lcom/roblox/client/signup/UsernameSignUpEditText;->I:Landroid/view/View$OnClickListener;

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/signup/UsernameSignUpEditText;->p()V

    return-void
.end method

.method static synthetic G(Lcom/roblox/client/signup/UsernameSignUpEditText;)Lcom/roblox/client/signup/b;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/signup/UsernameSignUpEditText;->H:Lcom/roblox/client/signup/b;

    return-object p0
.end method

.method private p()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/components/RbxEditText;->q:Z

    return-void
.end method


# virtual methods
.method public H()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RbxEditText;->setRightDrawableClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    sget v0, Lcom/roblox/client/x;->k:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/signup/UsernameSignUpEditText;->setRightIcon(I)V

    return-void
.end method

.method public I()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/signup/UsernameSignUpEditText;->setRightIcon(I)V

    return-void
.end method

.method public J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/UsernameSignUpEditText;->I:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RbxEditText;->setRightDrawableClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    sget v0, Lcom/roblox/client/x;->j:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/signup/UsernameSignUpEditText;->setRightIcon(I)V

    return-void
.end method

.method public K()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RbxEditText;->setRightDrawableClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    sget v0, Lcom/roblox/client/x;->l:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/signup/UsernameSignUpEditText;->setRightIcon(I)V

    return-void
.end method

.method public setGenerateUsernameIconTouchListener(Lcom/roblox/client/signup/b;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/UsernameSignUpEditText;->H:Lcom/roblox/client/signup/b;

    return-void
.end method

.method protected setRightIcon(I)V
    .locals 0

    return-void
.end method
