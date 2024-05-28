.class Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RbxBirthdayPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field n:I

.field o:I

.field p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState$a;

    invoke-direct {v0}, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState$a;-><init>()V

    sput-object v0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 6
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->n:I

    .line 8
    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->o:I

    .line 9
    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->p:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->o:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->n:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->p:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/roblox/client/components/RbxBirthdayPicker$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->n:I

    .line 4
    iput p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->o:I

    .line 5
    iput p1, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->p:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget p2, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->o:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget p2, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->n:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    iget p2, p0, Lcom/roblox/client/components/RbxBirthdayPicker$SavedState;->p:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
