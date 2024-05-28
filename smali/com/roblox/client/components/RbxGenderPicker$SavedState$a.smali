.class Lcom/roblox/client/components/RbxGenderPicker$SavedState$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RbxGenderPicker$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/roblox/client/components/RbxGenderPicker$SavedState;",
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
.method public a(Landroid/os/Parcel;)Lcom/roblox/client/components/RbxGenderPicker$SavedState;
    .locals 2

    new-instance v0, Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/roblox/client/components/RbxGenderPicker$SavedState;-><init>(Landroid/os/Parcel;Lcom/roblox/client/components/RbxGenderPicker$a;)V

    return-object v0
.end method

.method public b(I)[Lcom/roblox/client/components/RbxGenderPicker$SavedState;
    .locals 0

    new-array p1, p1, [Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RbxGenderPicker$SavedState$a;->a(Landroid/os/Parcel;)Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RbxGenderPicker$SavedState$a;->b(I)[Lcom/roblox/client/components/RbxGenderPicker$SavedState;

    move-result-object p1

    return-object p1
.end method
